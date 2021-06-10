package org.api.couriermanager.service.asset;

import org.api.couriermanager.entity.asset.Device;
import org.api.couriermanager.service.IService;

import java.util.List;

public interface IDeviceService extends IService<Device,String>{

    List<Device> readAll();
}
