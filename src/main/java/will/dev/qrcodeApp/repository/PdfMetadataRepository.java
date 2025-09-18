package will.dev.qrcodeApp.repository;

import will.dev.qrcodeApp.entity.PdfMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PdfMetadataRepository extends JpaRepository<PdfMetadata, Long> {
    
    Optional<PdfMetadata> findByUniqueId(String uniqueId);
    
    boolean existsByUniqueId(String uniqueId);
}

