package {{ group_id }}.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "{{ group_id }}.persistence")
@EnableJpaRepositories(basePackages = "{{ group_id }}.persistence")
public class PersistenceConfig {
}
