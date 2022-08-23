package com.xanfish.modules.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 
 *
 * @author ljz dfgr1510315@gmail.com
 * @since 1.0.0 2022-08-22
 */
@Data
@TableName("undo_log")
public class UndoLogEntity {

    /**
     * 
     */
	private Long id;
    /**
     * 
     */
	private Long branchId;
    /**
     * 
     */
	private String xid;
    /**
     * 
     */
	private String context;
    /**
     * 
     */
	private unknowType rollbackInfo;
    /**
     * 
     */
	private Integer logStatus;
    /**
     * 
     */
	private Date logCreated;
    /**
     * 
     */
	private Date logModified;
    /**
     * 
     */
	private String ext;
}