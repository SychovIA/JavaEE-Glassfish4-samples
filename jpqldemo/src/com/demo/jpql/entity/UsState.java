package com.demo.jpql.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="US_STATES")
@NamedQueries({
    @NamedQuery(name = "UsState.find", query = "SELECT u FROM UsState u WHERE u.usStateNm LIKE :name")})
public class UsState{
  @Column(name="US_STATE_ID")
  @Id
  private Integer usStateId;
  
  @Column(name="US_STATE_CD")
  private String usStateCd;
  
  @Column(name="US_STATE_NM")
  private String usStateNm;

  public String getUsStateCd(){
    return usStateCd;
  }

  public void setUsStateCd(String usStateCd){
    this.usStateCd = usStateCd;
  }

  public Integer getUsStateId(){
    return usStateId;
  }

  public void setUsStateId(Integer usStateId){
    this.usStateId = usStateId;
  }

  public String getUsStateNm(){
    return usStateNm;
  }

  public void setUsStateNm(String usStateNm){
    this.usStateNm = usStateNm;
  }
  
}