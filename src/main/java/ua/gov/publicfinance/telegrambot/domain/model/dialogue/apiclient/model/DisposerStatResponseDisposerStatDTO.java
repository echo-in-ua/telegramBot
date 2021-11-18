/*
 * Сервіс чатбота
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package ua.gov.publicfinance.telegrambot.domain.model.dialogue.apiclient.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DisposerStatResponseDisposerStatDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-10T13:37:39.038490800+02:00[Europe/Helsinki]")
public class DisposerStatResponseDisposerStatDTO {
  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private Map<String, DisposerStatDTO> response = null;


  public DisposerStatResponseDisposerStatDTO response(Map<String, DisposerStatDTO> response) {
    
    this.response = response;
    return this;
  }

  public DisposerStatResponseDisposerStatDTO putResponseItem(String key, DisposerStatDTO responseItem) {
    if (this.response == null) {
      this.response = new HashMap<String, DisposerStatDTO>();
    }
    this.response.put(key, responseItem);
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, DisposerStatDTO> getResponse() {
    return response;
  }


  public void setResponse(Map<String, DisposerStatDTO> response) {
    this.response = response;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisposerStatResponseDisposerStatDTO disposerStatResponseDisposerStatDTO = (DisposerStatResponseDisposerStatDTO) o;
    return Objects.equals(this.response, disposerStatResponseDisposerStatDTO.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisposerStatResponseDisposerStatDTO {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
