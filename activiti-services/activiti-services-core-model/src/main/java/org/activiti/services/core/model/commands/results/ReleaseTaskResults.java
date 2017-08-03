package org.activiti.services.core.model.commands.results;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ReleaseTaskResults implements CommandResults {

    private String id;
    private String commandId;

    public ReleaseTaskResults() {
        this.id = UUID.randomUUID().toString();
    }

    @JsonCreator
    public ReleaseTaskResults(@JsonProperty("id") String id,
                              @JsonProperty("commandId") String commandId) {
        this.id = id;
        this.commandId = commandId;
    }

    public ReleaseTaskResults(String commandId) {
        this();
        this.commandId = commandId;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getCommandId() {
        return commandId;
    }
}
