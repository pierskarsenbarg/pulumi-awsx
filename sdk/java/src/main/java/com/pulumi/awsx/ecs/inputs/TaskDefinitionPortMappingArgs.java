// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsx.ecs.inputs;

import com.pulumi.aws.lb.TargetGroup;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionPortMappingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionPortMappingArgs Empty = new TaskDefinitionPortMappingArgs();

    @Import(name="containerPort")
    private @Nullable Output<Integer> containerPort;

    public Optional<Output<Integer>> containerPort() {
        return Optional.ofNullable(this.containerPort);
    }

    @Import(name="hostPort")
    private @Nullable Output<Integer> hostPort;

    public Optional<Output<Integer>> hostPort() {
        return Optional.ofNullable(this.hostPort);
    }

    @Import(name="protocol")
    private @Nullable Output<String> protocol;

    public Optional<Output<String>> protocol() {
        return Optional.ofNullable(this.protocol);
    }

    @Import(name="targetGroup")
    private @Nullable Output<TargetGroup> targetGroup;

    public Optional<Output<TargetGroup>> targetGroup() {
        return Optional.ofNullable(this.targetGroup);
    }

    private TaskDefinitionPortMappingArgs() {}

    private TaskDefinitionPortMappingArgs(TaskDefinitionPortMappingArgs $) {
        this.containerPort = $.containerPort;
        this.hostPort = $.hostPort;
        this.protocol = $.protocol;
        this.targetGroup = $.targetGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TaskDefinitionPortMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TaskDefinitionPortMappingArgs $;

        public Builder() {
            $ = new TaskDefinitionPortMappingArgs();
        }

        public Builder(TaskDefinitionPortMappingArgs defaults) {
            $ = new TaskDefinitionPortMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            $.containerPort = containerPort;
            return this;
        }

        public Builder containerPort(Integer containerPort) {
            return containerPort(Output.of(containerPort));
        }

        public Builder hostPort(@Nullable Output<Integer> hostPort) {
            $.hostPort = hostPort;
            return this;
        }

        public Builder hostPort(Integer hostPort) {
            return hostPort(Output.of(hostPort));
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public Builder targetGroup(@Nullable Output<TargetGroup> targetGroup) {
            $.targetGroup = targetGroup;
            return this;
        }

        public Builder targetGroup(TargetGroup targetGroup) {
            return targetGroup(Output.of(targetGroup));
        }

        public TaskDefinitionPortMappingArgs build() {
            return $;
        }
    }

}
