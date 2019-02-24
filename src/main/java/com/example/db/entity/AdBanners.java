package com.example.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.example.db.base.BaseEntity;
import com.example.db.enums.BannerStatus;
import com.example.db.enums.BannerTarget;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * Banner信息
 * </p>
 *
 * @author cotide
 * @since 2019-02-24
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class AdBanners extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * BannerId
     */
    @TableId(value = "banner_id", type = IdType.AUTO)
    private Integer bannerId;

    /**
     * Banner名
     */
    private String name;

    /**
     * 文章类型Id
     */
    private Integer locationId;

    /**
     * 标题
     */
    private String title;

    /**
     * 状态 禁用(-1) ,正常(0)
     */
    private BannerStatus status;

    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 跳转地址
     */
    private String url;

    /**
     * 打开方式: 0新窗口,1当前窗口
     */
    private BannerTarget target;

    /**
     * 开始时间
     */
    private LocalDateTime beginTime;

    /**
     * 结束时间
     */
    private LocalDateTime endTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifyTime;


}
