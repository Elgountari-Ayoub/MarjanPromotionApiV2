package com.example.marjanpromotionapiv2test.Observer;

import com.example.marjanpromotionapiv2test.Entities.AdminRayonEntity;
import com.example.marjanpromotionapiv2test.Services.Impl.AdminRayonServiceImpl;

// observable subject
public interface Observable {
    // Subscribe
   public void addAdminRayon(AdminRayonServiceImpl adminRayonService);
//UnSubscribe
    public void removeAdminRayon(AdminRayonServiceImpl adminRayonService);

    public void notifyAdminsRayons();


}
