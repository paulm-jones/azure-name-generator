package io.swagger.api;

import com.citihub.azure_name_generator.services.ResourceNameService;
import io.swagger.model.ResourceName;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotNull;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-31T08:50:33.227Z")

@Controller
public class ManagementController implements LockApi, PolicyApi, ResourceGroupApi {

    @Override
    public ResponseEntity<ResourceName> generateLockName(@NotNull String resource) {
        return null;
    }

    @Override
    public ResponseEntity<ResourceName> generatePolicyName(@NotNull String creator, @NotNull String action, @NotNull String context) {
        return null;
    }

    @Override
    public ResponseEntity<ResourceName> generateResourceGroupName(@NotNull String subscription, @NotNull String context) {
        return null;
    }
}
