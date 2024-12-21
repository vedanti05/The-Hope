package com.symbiosis.hope.model;


import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

	@Entity
	 public class Media {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String medianame;

	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="media_images",joinColumns= {
			@JoinColumn(name="media_id")
	},
	inverseJoinColumns= {
			@JoinColumn(name="image_id")
	}
	)
	private Set<ImageModel> mediaImages;
	

	public Set<ImageModel> getMediaImages() {
		return mediaImages;
	}
	public void setCourseImages(Set<ImageModel> mediaImages) {
		this.mediaImages = mediaImages;
	}
	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Media(String medianame) {
		super();
		this.medianame = medianame;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMedianame() {
		return medianame;
	}
	public void setCoursename(String medianame) {
		this.medianame = medianame;
	}



	}
	