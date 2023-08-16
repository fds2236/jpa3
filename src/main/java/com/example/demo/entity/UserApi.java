package com.example.demo.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "upt_user_api") //API 신청 이력
@Getter
@NoArgsConstructor
public class UserApi {
	@Builder
	public UserApi(String userId, String productId, String apiId
//			,UserApproval approval
		) {
		super();
		this.userId = userId;
		this.productId = productId;
		this.apiId = apiId;
		this.apiChangedDate = ZonedDateTime.now();
//		this.approvalExt = approvalExt;
	}
	@Id
	private Long id; // 아이디
	
	@Column(name = "user_id")
	private String userId; // 유저아이디
	
	@Column(name = "app_id")
	private Long appId; // 앱아이디
	
	@Column(name = "app_created_date")
	private ZonedDateTime appCreatedDate; // api생성일
	
	@Column(name = "product_id")
	private String productId; // 상품아이디
	
	@Column(name = "api_id")
	private String apiId; // api아이디
	
	@Column(name = "api_changed_date")
	private ZonedDateTime apiChangedDate; // api변경일
	
	@Column(name = "contract_registered_date")
	private ZonedDateTime contractRegisteredDate; // 계약등록일

	public Long getId() {
		return id;
	}

	public String getUserId() {
		return userId;
	}

	public Long getAppId() {
		return appId;
	}

	public ZonedDateTime getAppCreatedDate() {
		return appCreatedDate;
	}

	public String getProductId() {
		return productId;
	}

	public String getApiId() {
		return apiId;
	}

	public ZonedDateTime getApiChangedDate() {
		return apiChangedDate;
	}

	public ZonedDateTime getContractRegisteredDate() {
		return contractRegisteredDate;
	}
	
	

//	@ManyToOne
//	@JoinColumn(name = "approval_id", referencedColumnName = "id")
//	private UserApproval approvalExt; // approval_id => 승인자아이디

}
