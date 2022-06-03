/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterNetworkSettings extends AbstractModel{

    /**
    * 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
    */
    @SerializedName("ClusterCIDR")
    @Expose
    private String ClusterCIDR;

    /**
    * 是否忽略 ClusterCIDR 冲突错误, 默认不忽略
    */
    @SerializedName("IgnoreClusterCIDRConflict")
    @Expose
    private Boolean IgnoreClusterCIDRConflict;

    /**
    * 集群中每个Node上最大的Pod数量(默认为256)
    */
    @SerializedName("MaxNodePodNum")
    @Expose
    private Long MaxNodePodNum;

    /**
    * 集群最大的service数量(默认为256)
    */
    @SerializedName("MaxClusterServiceNum")
    @Expose
    private Long MaxClusterServiceNum;

    /**
    * 是否启用IPVS(默认不开启)
    */
    @SerializedName("Ipvs")
    @Expose
    private Boolean Ipvs;

    /**
    * 集群的VPCID（如果创建空集群，为必传值，否则自动设置为和集群的节点保持一致）
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 网络插件是否启用CNI(默认开启)
    */
    @SerializedName("Cni")
    @Expose
    private Boolean Cni;

    /**
    * service的网络模式，当前参数只适用于ipvs+bpf模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KubeProxyMode")
    @Expose
    private String KubeProxyMode;

    /**
    * 用于分配service的IP range，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * 集群关联的容器子网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subnets")
    @Expose
    private String [] Subnets;

    /**
    * 是否忽略 ServiceCIDR 冲突错误, 仅在 VPC-CNI 模式生效，默认不忽略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreServiceCIDRConflict")
    @Expose
    private Boolean IgnoreServiceCIDRConflict;

    /**
     * Get 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突 
     * @return ClusterCIDR 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
     */
    public String getClusterCIDR() {
        return this.ClusterCIDR;
    }

    /**
     * Set 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
     * @param ClusterCIDR 用于分配集群容器和服务 IP 的 CIDR，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
     */
    public void setClusterCIDR(String ClusterCIDR) {
        this.ClusterCIDR = ClusterCIDR;
    }

    /**
     * Get 是否忽略 ClusterCIDR 冲突错误, 默认不忽略 
     * @return IgnoreClusterCIDRConflict 是否忽略 ClusterCIDR 冲突错误, 默认不忽略
     */
    public Boolean getIgnoreClusterCIDRConflict() {
        return this.IgnoreClusterCIDRConflict;
    }

    /**
     * Set 是否忽略 ClusterCIDR 冲突错误, 默认不忽略
     * @param IgnoreClusterCIDRConflict 是否忽略 ClusterCIDR 冲突错误, 默认不忽略
     */
    public void setIgnoreClusterCIDRConflict(Boolean IgnoreClusterCIDRConflict) {
        this.IgnoreClusterCIDRConflict = IgnoreClusterCIDRConflict;
    }

    /**
     * Get 集群中每个Node上最大的Pod数量(默认为256) 
     * @return MaxNodePodNum 集群中每个Node上最大的Pod数量(默认为256)
     */
    public Long getMaxNodePodNum() {
        return this.MaxNodePodNum;
    }

    /**
     * Set 集群中每个Node上最大的Pod数量(默认为256)
     * @param MaxNodePodNum 集群中每个Node上最大的Pod数量(默认为256)
     */
    public void setMaxNodePodNum(Long MaxNodePodNum) {
        this.MaxNodePodNum = MaxNodePodNum;
    }

    /**
     * Get 集群最大的service数量(默认为256) 
     * @return MaxClusterServiceNum 集群最大的service数量(默认为256)
     */
    public Long getMaxClusterServiceNum() {
        return this.MaxClusterServiceNum;
    }

    /**
     * Set 集群最大的service数量(默认为256)
     * @param MaxClusterServiceNum 集群最大的service数量(默认为256)
     */
    public void setMaxClusterServiceNum(Long MaxClusterServiceNum) {
        this.MaxClusterServiceNum = MaxClusterServiceNum;
    }

    /**
     * Get 是否启用IPVS(默认不开启) 
     * @return Ipvs 是否启用IPVS(默认不开启)
     */
    public Boolean getIpvs() {
        return this.Ipvs;
    }

    /**
     * Set 是否启用IPVS(默认不开启)
     * @param Ipvs 是否启用IPVS(默认不开启)
     */
    public void setIpvs(Boolean Ipvs) {
        this.Ipvs = Ipvs;
    }

    /**
     * Get 集群的VPCID（如果创建空集群，为必传值，否则自动设置为和集群的节点保持一致） 
     * @return VpcId 集群的VPCID（如果创建空集群，为必传值，否则自动设置为和集群的节点保持一致）
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群的VPCID（如果创建空集群，为必传值，否则自动设置为和集群的节点保持一致）
     * @param VpcId 集群的VPCID（如果创建空集群，为必传值，否则自动设置为和集群的节点保持一致）
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 网络插件是否启用CNI(默认开启) 
     * @return Cni 网络插件是否启用CNI(默认开启)
     */
    public Boolean getCni() {
        return this.Cni;
    }

    /**
     * Set 网络插件是否启用CNI(默认开启)
     * @param Cni 网络插件是否启用CNI(默认开启)
     */
    public void setCni(Boolean Cni) {
        this.Cni = Cni;
    }

    /**
     * Get service的网络模式，当前参数只适用于ipvs+bpf模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KubeProxyMode service的网络模式，当前参数只适用于ipvs+bpf模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKubeProxyMode() {
        return this.KubeProxyMode;
    }

    /**
     * Set service的网络模式，当前参数只适用于ipvs+bpf模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param KubeProxyMode service的网络模式，当前参数只适用于ipvs+bpf模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeProxyMode(String KubeProxyMode) {
        this.KubeProxyMode = KubeProxyMode;
    }

    /**
     * Get 用于分配service的IP range，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCIDR 用于分配service的IP range，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set 用于分配service的IP range，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCIDR 用于分配service的IP range，不得与 VPC CIDR 冲突，也不得与同 VPC 内其他集群 CIDR 冲突
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    /**
     * Get 集群关联的容器子网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subnets 集群关联的容器子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSubnets() {
        return this.Subnets;
    }

    /**
     * Set 集群关联的容器子网
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subnets 集群关联的容器子网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnets(String [] Subnets) {
        this.Subnets = Subnets;
    }

    /**
     * Get 是否忽略 ServiceCIDR 冲突错误, 仅在 VPC-CNI 模式生效，默认不忽略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreServiceCIDRConflict 是否忽略 ServiceCIDR 冲突错误, 仅在 VPC-CNI 模式生效，默认不忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIgnoreServiceCIDRConflict() {
        return this.IgnoreServiceCIDRConflict;
    }

    /**
     * Set 是否忽略 ServiceCIDR 冲突错误, 仅在 VPC-CNI 模式生效，默认不忽略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreServiceCIDRConflict 是否忽略 ServiceCIDR 冲突错误, 仅在 VPC-CNI 模式生效，默认不忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreServiceCIDRConflict(Boolean IgnoreServiceCIDRConflict) {
        this.IgnoreServiceCIDRConflict = IgnoreServiceCIDRConflict;
    }

    public ClusterNetworkSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterNetworkSettings(ClusterNetworkSettings source) {
        if (source.ClusterCIDR != null) {
            this.ClusterCIDR = new String(source.ClusterCIDR);
        }
        if (source.IgnoreClusterCIDRConflict != null) {
            this.IgnoreClusterCIDRConflict = new Boolean(source.IgnoreClusterCIDRConflict);
        }
        if (source.MaxNodePodNum != null) {
            this.MaxNodePodNum = new Long(source.MaxNodePodNum);
        }
        if (source.MaxClusterServiceNum != null) {
            this.MaxClusterServiceNum = new Long(source.MaxClusterServiceNum);
        }
        if (source.Ipvs != null) {
            this.Ipvs = new Boolean(source.Ipvs);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.Cni != null) {
            this.Cni = new Boolean(source.Cni);
        }
        if (source.KubeProxyMode != null) {
            this.KubeProxyMode = new String(source.KubeProxyMode);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
        if (source.Subnets != null) {
            this.Subnets = new String[source.Subnets.length];
            for (int i = 0; i < source.Subnets.length; i++) {
                this.Subnets[i] = new String(source.Subnets[i]);
            }
        }
        if (source.IgnoreServiceCIDRConflict != null) {
            this.IgnoreServiceCIDRConflict = new Boolean(source.IgnoreServiceCIDRConflict);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterCIDR", this.ClusterCIDR);
        this.setParamSimple(map, prefix + "IgnoreClusterCIDRConflict", this.IgnoreClusterCIDRConflict);
        this.setParamSimple(map, prefix + "MaxNodePodNum", this.MaxNodePodNum);
        this.setParamSimple(map, prefix + "MaxClusterServiceNum", this.MaxClusterServiceNum);
        this.setParamSimple(map, prefix + "Ipvs", this.Ipvs);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Cni", this.Cni);
        this.setParamSimple(map, prefix + "KubeProxyMode", this.KubeProxyMode);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamArraySimple(map, prefix + "Subnets.", this.Subnets);
        this.setParamSimple(map, prefix + "IgnoreServiceCIDRConflict", this.IgnoreServiceCIDRConflict);

    }
}

