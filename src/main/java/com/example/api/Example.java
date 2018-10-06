
package com.example.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CategoryId",
    "Name",
    "Path",
    "CanListAuctions",
    "CanListClassifieds",
    "CanRelist",
    "LegalNotice",
    "DefaultDuration",
    "AllowedDurations",
    "Fees",
    "FreePhotoCount",
    "MaximumPhotoCount",
    "IsFreeToRelist",
    "Promotions",
    "EmbeddedContentOptions",
    "MaximumTitleLength",
    "AreaOfBusiness",
    "DefaultRelistDuration"
})
public class Example {

    @JsonProperty("CategoryId")
    private Integer categoryId;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Path")
    private String path;
    @JsonProperty("CanListAuctions")
    private Boolean canListAuctions;
    @JsonProperty("CanListClassifieds")
    private Boolean canListClassifieds;
    @JsonProperty("CanRelist")
    private Boolean canRelist;
    @JsonProperty("LegalNotice")
    private String legalNotice;
    @JsonProperty("DefaultDuration")
    private Integer defaultDuration;
    @JsonProperty("AllowedDurations")
    private List<Integer> allowedDurations = null;
    @JsonProperty("Fees")
    private Fees fees;
    @JsonProperty("FreePhotoCount")
    private Integer freePhotoCount;
    @JsonProperty("MaximumPhotoCount")
    private Integer maximumPhotoCount;
    @JsonProperty("IsFreeToRelist")
    private Boolean isFreeToRelist;
    @JsonProperty("Promotions")
    private List<Promotion> promotions = null;
    @JsonProperty("EmbeddedContentOptions")
    private List<Object> embeddedContentOptions = null;
    @JsonProperty("MaximumTitleLength")
    private Integer maximumTitleLength;
    @JsonProperty("AreaOfBusiness")
    private Integer areaOfBusiness;
    @JsonProperty("DefaultRelistDuration")
    private Integer defaultRelistDuration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CategoryId")
    public Integer getCategoryId() {
        return categoryId;
    }

    @JsonProperty("CategoryId")
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    @JsonProperty("Path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("CanListAuctions")
    public Boolean getCanListAuctions() {
        return canListAuctions;
    }

    @JsonProperty("CanListAuctions")
    public void setCanListAuctions(Boolean canListAuctions) {
        this.canListAuctions = canListAuctions;
    }

    @JsonProperty("CanListClassifieds")
    public Boolean getCanListClassifieds() {
        return canListClassifieds;
    }

    @JsonProperty("CanListClassifieds")
    public void setCanListClassifieds(Boolean canListClassifieds) {
        this.canListClassifieds = canListClassifieds;
    }

    @JsonProperty("CanRelist")
    public Boolean getCanRelist() {
        return canRelist;
    }

    @JsonProperty("CanRelist")
    public void setCanRelist(Boolean canRelist) {
        this.canRelist = canRelist;
    }

    @JsonProperty("LegalNotice")
    public String getLegalNotice() {
        return legalNotice;
    }

    @JsonProperty("LegalNotice")
    public void setLegalNotice(String legalNotice) {
        this.legalNotice = legalNotice;
    }

    @JsonProperty("DefaultDuration")
    public Integer getDefaultDuration() {
        return defaultDuration;
    }

    @JsonProperty("DefaultDuration")
    public void setDefaultDuration(Integer defaultDuration) {
        this.defaultDuration = defaultDuration;
    }

    @JsonProperty("AllowedDurations")
    public List<Integer> getAllowedDurations() {
        return allowedDurations;
    }

    @JsonProperty("AllowedDurations")
    public void setAllowedDurations(List<Integer> allowedDurations) {
        this.allowedDurations = allowedDurations;
    }

    @JsonProperty("Fees")
    public Fees getFees() {
        return fees;
    }

    @JsonProperty("Fees")
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    @JsonProperty("FreePhotoCount")
    public Integer getFreePhotoCount() {
        return freePhotoCount;
    }

    @JsonProperty("FreePhotoCount")
    public void setFreePhotoCount(Integer freePhotoCount) {
        this.freePhotoCount = freePhotoCount;
    }

    @JsonProperty("MaximumPhotoCount")
    public Integer getMaximumPhotoCount() {
        return maximumPhotoCount;
    }

    @JsonProperty("MaximumPhotoCount")
    public void setMaximumPhotoCount(Integer maximumPhotoCount) {
        this.maximumPhotoCount = maximumPhotoCount;
    }

    @JsonProperty("IsFreeToRelist")
    public Boolean getIsFreeToRelist() {
        return isFreeToRelist;
    }

    @JsonProperty("IsFreeToRelist")
    public void setIsFreeToRelist(Boolean isFreeToRelist) {
        this.isFreeToRelist = isFreeToRelist;
    }

    @JsonProperty("Promotions")
    public List<Promotion> getPromotions() {
        return promotions;
    }

    @JsonProperty("Promotions")
    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }

    @JsonProperty("EmbeddedContentOptions")
    public List<Object> getEmbeddedContentOptions() {
        return embeddedContentOptions;
    }

    @JsonProperty("EmbeddedContentOptions")
    public void setEmbeddedContentOptions(List<Object> embeddedContentOptions) {
        this.embeddedContentOptions = embeddedContentOptions;
    }

    @JsonProperty("MaximumTitleLength")
    public Integer getMaximumTitleLength() {
        return maximumTitleLength;
    }

    @JsonProperty("MaximumTitleLength")
    public void setMaximumTitleLength(Integer maximumTitleLength) {
        this.maximumTitleLength = maximumTitleLength;
    }

    @JsonProperty("AreaOfBusiness")
    public Integer getAreaOfBusiness() {
        return areaOfBusiness;
    }

    @JsonProperty("AreaOfBusiness")
    public void setAreaOfBusiness(Integer areaOfBusiness) {
        this.areaOfBusiness = areaOfBusiness;
    }

    @JsonProperty("DefaultRelistDuration")
    public Integer getDefaultRelistDuration() {
        return defaultRelistDuration;
    }

    @JsonProperty("DefaultRelistDuration")
    public void setDefaultRelistDuration(Integer defaultRelistDuration) {
        this.defaultRelistDuration = defaultRelistDuration;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
