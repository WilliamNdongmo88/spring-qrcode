package will.dev.qrcodeApp.repository;

import will.dev.qrcodeApp.entity.QrCodeMetadata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface QrCodeMetadataRepository extends JpaRepository<QrCodeMetadata, Long> {
    
    Optional<QrCodeMetadata> findByUniqueId(String uniqueId);
    
    Optional<QrCodeMetadata> findByPdfId(String pdfId);
    
    boolean existsByUniqueId(String uniqueId);
    
    boolean existsByPdfId(String pdfId);
}

