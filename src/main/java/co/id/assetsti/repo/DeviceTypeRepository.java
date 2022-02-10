package co.id.assetsti.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.id.assetsti.model.DeviceType;

@Repository
public interface DeviceTypeRepository extends JpaRepository<DeviceType, Integer> {
	List<DeviceType> findByDeviceCategory(String deviceCategory);
}
