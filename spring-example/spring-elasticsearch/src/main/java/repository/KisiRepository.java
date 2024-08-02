package repository;

import com.haydikodlayalim.entity.Kisi;
import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.elasticsearch.annotations.Query;

@Repository

public interface KisiRepository extends ElasticsearchRepository<Kisi, String> {
    @Query("{\"bool\": {\"must\": [{\"match\": {\"ad\":\"?0\"}}]}}")
        List<Kisi> getByCustomQuery(String search);
}
