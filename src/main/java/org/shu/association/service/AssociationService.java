package org.shu.association.service;

import org.shu.association.dto.Page;
import org.shu.association.entity.Association;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/26
 * Time: 15:28
 */
public interface AssociationService {

    /**
     * 获取社团详细信息
     * @param associationId
     * @return
     */
    Association getAssociationById(Long associationId);

    /**
     * 获取社团列表，默认大小15
     * @param type
     * @param star
     * @param currentPage
     * @return
     */
    Page getAssociationListByStarAndTypeAndPage(Integer type, Integer star, String name, Integer currentPage);
}
