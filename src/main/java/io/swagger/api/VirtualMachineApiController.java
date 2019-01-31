package io.swagger.api;

import com.citihub.azure_name_generator.services.ResourceNameService;
import io.swagger.model.ResourceName;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotNull;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-31T08:50:33.227Z")

@Controller
public class VirtualMachineApiController implements VirtualMachineApi {

    @Override
    public ResponseEntity<ResourceName> generateCompute(@NotNull String countryCode, @NotNull String location) {
        return ResponseEntity.ok(ResourceNameService.getVirtualMachineName());
    }
}
