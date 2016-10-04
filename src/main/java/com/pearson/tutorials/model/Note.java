package com.pearson.tutorials.model;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The Model(Domain) Class Note.
 *
 * @author Danushka Jayamaha
 */
@ApiModel(description = "Note")
@JsonInclude(Include.ALWAYS)
@Document(collection = "note")
public class Note {

    /** The note id. */
    @Id
    @ApiModelProperty(readOnly = true)
    private String noteId;

    /** The topic. */
    @NotEmpty
    @ApiModelProperty(required = true)
    private String topic;

    /** The description. */
    @NotEmpty
    @ApiModelProperty(required = true)
    private String description;

    /** The deleted. */
    @JsonIgnore
    private boolean deleted;

    /** The created time. */
    @ApiModelProperty(readOnly = true)
    private Date createdAt;

    /** The updated time. */
    @ApiModelProperty(readOnly = true)
    private Date updatedAt;

    /**
     * Gets the note id.
     *
     * @return the noteId
     */
    public String getNoteId() {
        return noteId;
    }

    /**
     * Sets the note id.
     *
     * @param noteId
     *            the noteId to set
     */
    public void setNoteId(final String noteId) {
        this.noteId = noteId;
    }

    /**
     * Gets the topic.
     *
     * @return the topic
     */
    public String getTopic() {
        return topic;
    }

    /**
     * Sets the topic.
     *
     * @param topic
     *            the topic to set
     */
    public void setTopic(final String topic) {
        this.topic = topic;
    }

    /**
     * Gets the description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     *
     * @param description
     *            the description to set
     */
    public void setDescription(final String description) {
        this.description = description;
    }

    /**
     * Checks if is deleted.
     *
     * @return the deleted
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the deleted.
     *
     * @param deleted
     *            the deleted to set
     */
    public void setDeleted(final boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Gets the created at.
     *
     * @return the created date and time
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the created at.
     *
     * @param createdAt
     *            the created date and time to set
     */
    public void setCreatedAt(final Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Gets the updated at.
     *
     * @return the updated date and time
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the updated at.
     *
     * @param updatedAt
     *            the updated date and time to set
     */
    public void setUpdatedAt(final Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}