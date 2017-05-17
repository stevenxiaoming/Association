package org.shu.association.dao;

import org.apache.ibatis.annotations.Param;
import org.shu.association.entity.Association;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/25
 * Time: 10:53
 */
public interface AssociationDao {
    /**
     * 查询社团数量
     * @return
     */
    int getAssociationNumber(@Param("type") String type, @Param("star") Integer star, @Param("name") String name);

    /**
     * 获取社团List信息
     * @return
     */
    List<Association> getAssociationList(@Param("type") String type, @Param("star") Integer star,
                                         @Param("name") String name, @Param("offset") int offset,
                                         @Param("pageSize") int pageSize);

    /**
     * 根据社团ID查询社团详细信息
     * @param associationId
     * @return
     */
    Association getAssociationDetailById(@Param("associationId") Long associationId);

    /**
     * 创建社团主表
     * @param association
     * @return
     */
    int insertAssociationMain(@Param("association") Association association);

    /**
     * 创建社团从表
     * @param association
     * @return
     */
    int insertAssociationIntroduction(@Param("association") Association association);


    /**
     * 更新社团关键信息
     * @param association
     * @return
     */
    int updateAssociationEssential(@Param("association") Association association);

    /**
     * 更新社团基本信息
     * @param association
     * @return
     */
    int updateAssociationBasic(@Param("association") Association association);

    /**
     * 更新社团介绍
     * @param association
     * @return
     */
    int updateAssociationIntroduction(@Param("association") Association association);

    /**
     * 删除社团主表
     * @param associationId
     * @return
     */
    int deleteAssociationMain(@Param("associationId") Long associationId);

    /**
     * 删除社团从表
     * @param associationId
     * @return
     */
    int deleteAssociationIntroduction(@Param("associationId") Long associationId);

}
