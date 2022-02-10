package co.id.assetsti.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.id.assetsti.model.DevicePenalty;

@Repository
public interface DevicePenaltyRepository extends JpaRepository<DevicePenalty, Integer> {

	public List<DevicePenalty> findByDeviceCategory(String deviceCategory);
}
