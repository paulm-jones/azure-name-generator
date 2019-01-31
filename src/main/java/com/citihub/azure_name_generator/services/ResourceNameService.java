package com.citihub.azure_name_generator.services;

import io.swagger.model.ResourceName;

public class ResourceNameService {

    public static ResourceName getVirtualMachineName() {

        ResourceName rn = new ResourceName();
        return rn.resourceName("X");

    }

}
