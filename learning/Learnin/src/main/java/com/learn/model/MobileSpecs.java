package com.learn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mobilespecs")
public class MobileSpecs {

	public String getMobilename() {
		return mobilename;
	}

	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}

	public String getMobilespec() {
		return mobilespec;
	}

	public void setMobilespec(String mobilespec) {
		this.mobilespec = mobilespec;
	}

	@Id
	@Column(name = "mobilename")
	private String mobilename;

	@Column(name = "mobilespec")
	private String mobilespec;

}
