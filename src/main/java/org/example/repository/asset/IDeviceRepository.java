package org.example.repository.asset;

import org.example.entity.asset.Device;
import org.example.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDeviceRepository extends JpaRepository<Device, String> {
}
