package org.api.couriermanager.repository.asset;

import org.api.couriermanager.entity.asset.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeviceRepository extends JpaRepository<Device, String> {
}
