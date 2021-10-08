/*
 * Catena-X Speedboat Test Data Generator
 * Disclaimer: This service serves synthetic, none-productive data for testing purposes only. All BOMs, part trees, VINs, serialNos etc. are synthetic
 *
 * OpenAPI spec version: 0.0.1 Speedboat
 * Contact: christian.kabelin@partner.bmw.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.client.model.PartRelationship;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Describes an update of a relationship
 */@Schema(description = "Describes an update of a relationship")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2021-10-03T20:34:34.146648200+02:00[Europe/Berlin]")
public class PartRelationshipUpdate {

  
  @JsonProperty("effectTime")
  private String effectTime = null;
  
  
  @JsonProperty("relationship")
  private PartRelationship relationship = null;
  
  
  @JsonProperty("remove")
  private Boolean remove = null;
  
  /**
   * Stage defining whether changes apply to the AS_BUILT or AS_MAINTAINED BOM views.
   */
  public enum StageEnum {
    
    BUILD("BUILD"),
    MAINTENANCE("MAINTENANCE");

    private String value;

    StageEnum(String value) {
      this.value = value;
    }
    
    @JsonValue
    
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    
    @JsonCreator
    
    public static StageEnum fromValue(String text) {
      for (StageEnum b : StageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    
  }
  
  
  @JsonProperty("stage")
  private StageEnum stage = null;
  
  public PartRelationshipUpdate effectTime(String effectTime) {
    this.effectTime = effectTime;
    return this;
  }

  
  /**
  * Instant at which the update was applied
  * @return effectTime
  **/
  
  
  @Schema(required = true, description = "Instant at which the update was applied")
  public String getEffectTime() {
    return effectTime;
  }
  public void setEffectTime(String effectTime) {
    this.effectTime = effectTime;
  }
  
  public PartRelationshipUpdate relationship(PartRelationship relationship) {
    this.relationship = relationship;
    return this;
  }

  
  /**
  * Get relationship
  * @return relationship
  **/
  
  
  @Schema(required = true, description = "")
  public PartRelationship getRelationship() {
    return relationship;
  }
  public void setRelationship(PartRelationship relationship) {
    this.relationship = relationship;
  }
  
  public PartRelationshipUpdate remove(Boolean remove) {
    this.remove = remove;
    return this;
  }

  
  /**
  * &lt;ul&gt;   &lt;li&gt;TRUE if the child is not part of the parent (used to update data, e.g. a relationship was wrongly submitted, or a part is removed from a car during maintenance)&lt;/li&gt;   &lt;li&gt;FALSE otherwise (“normal case” - a part is added into a parent part).&lt;/li&gt;&lt;/ul&gt;
  * @return remove
  **/
  
  
  @Schema(description = "<ul>   <li>TRUE if the child is not part of the parent (used to update data, e.g. a relationship was wrongly submitted, or a part is removed from a car during maintenance)</li>   <li>FALSE otherwise (“normal case” - a part is added into a parent part).</li></ul>")
  public Boolean isRemove() {
    return remove;
  }
  public void setRemove(Boolean remove) {
    this.remove = remove;
  }
  
  public PartRelationshipUpdate stage(StageEnum stage) {
    this.stage = stage;
    return this;
  }

  
  /**
  * Stage defining whether changes apply to the AS_BUILT or AS_MAINTAINED BOM views.
  * @return stage
  **/
  
  
  @Schema(required = true, description = "Stage defining whether changes apply to the AS_BUILT or AS_MAINTAINED BOM views.")
  public StageEnum getStage() {
    return stage;
  }
  public void setStage(StageEnum stage) {
    this.stage = stage;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartRelationshipUpdate partRelationshipUpdate = (PartRelationshipUpdate) o;
    return Objects.equals(this.effectTime, partRelationshipUpdate.effectTime) &&
        Objects.equals(this.relationship, partRelationshipUpdate.relationship) &&
        Objects.equals(this.remove, partRelationshipUpdate.remove) &&
        Objects.equals(this.stage, partRelationshipUpdate.stage);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(effectTime, relationship, remove, stage);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartRelationshipUpdate {\n");
    
    sb.append("    effectTime: ").append(toIndentedString(effectTime)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  
}


