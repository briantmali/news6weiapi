package com.news6wei.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class News implements Serializable {

	@Id
	@GeneratedValue
	private Long ID;
	private String TITLE;
	private String KEY_WORD;
	private String NEWS_CONTENTS;
	private String MEDIA_CODE;
	private String LANGUAGE_CODE;
	private String PRI_LEVEL;
	private String CATEGORY_CODE;
	private String DISCLOSURE_TIME;
	/**
	 * @return iD
	 */
	public Long getID() {
		return ID;
	}
	/**
	 * @param iD セットする iD
	 */
	public void setID(Long iD) {
		ID = iD;
	}
	/**
	 * @return tITLE
	 */
	public String getTITLE() {
		return TITLE;
	}
	/**
	 * @param tITLE セットする tITLE
	 */
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	/**
	 * @return kEY_WORD
	 */
	public String getKEY_WORD() {
		return KEY_WORD;
	}
	/**
	 * @param kEY_WORD セットする kEY_WORD
	 */
	public void setKEY_WORD(String kEY_WORD) {
		KEY_WORD = kEY_WORD;
	}
	/**
	 * @return nEWS_CONTENTS
	 */
	public String getNEWS_CONTENTS() {
		return NEWS_CONTENTS;
	}
	/**
	 * @param nEWS_CONTENTS セットする nEWS_CONTENTS
	 */
	public void setNEWS_CONTENTS(String nEWS_CONTENTS) {
		NEWS_CONTENTS = nEWS_CONTENTS;
	}
	/**
	 * @return mEDIA_CODE
	 */
	public String getMEDIA_CODE() {
		return MEDIA_CODE;
	}
	/**
	 * @param mEDIA_CODE セットする mEDIA_CODE
	 */
	public void setMEDIA_CODE(String mEDIA_CODE) {
		MEDIA_CODE = mEDIA_CODE;
	}
	/**
	 * @return lANGUAGE_CODE
	 */
	public String getLANGUAGE_CODE() {
		return LANGUAGE_CODE;
	}
	/**
	 * @param lANGUAGE_CODE セットする lANGUAGE_CODE
	 */
	public void setLANGUAGE_CODE(String lANGUAGE_CODE) {
		LANGUAGE_CODE = lANGUAGE_CODE;
	}
	/**
	 * @return pRI_LEVEL
	 */
	public String getPRI_LEVEL() {
		return PRI_LEVEL;
	}
	/**
	 * @param pRI_LEVEL セットする pRI_LEVEL
	 */
	public void setPRI_LEVEL(String pRI_LEVEL) {
		PRI_LEVEL = pRI_LEVEL;
	}
	/**
	 * @return cATEGORY_CODE
	 */
	public String getCATEGORY_CODE() {
		return CATEGORY_CODE;
	}
	/**
	 * @param cATEGORY_CODE セットする cATEGORY_CODE
	 */
	public void setCATEGORY_CODE(String cATEGORY_CODE) {
		CATEGORY_CODE = cATEGORY_CODE;
	}
	/**
	 * @return dISCLOSURE_TIME
	 */
	public String getDISCLOSURE_TIME() {
		return DISCLOSURE_TIME;
	}
	/**
	 * @param dISCLOSURE_TIME セットする dISCLOSURE_TIME
	 */
	public void setDISCLOSURE_TIME(String dISCLOSURE_TIME) {
		DISCLOSURE_TIME = dISCLOSURE_TIME;
	}
}
