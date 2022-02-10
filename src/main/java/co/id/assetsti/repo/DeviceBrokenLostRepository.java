package co.id.assetsti.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.id.assetsti.model.DeviceBrokenLost;

@Repository
public interface DeviceBrokenLostRepository extends JpaRepository<DeviceBrokenLost, Integer> {

	public List<DeviceBrokenLost> findByDeviceCategory(String deviceCategory);
}
