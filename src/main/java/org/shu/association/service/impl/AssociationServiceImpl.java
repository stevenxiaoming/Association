package org.shu.association.service.impl;

import org.shu.association.dao.AssociationDao;
import org.shu.association.dto.Page;
import org.shu.association.entity.Association;
import org.shu.association.enums.AssociationStatEnum;
import org.shu.association.service.AssociationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/28
 * Time: 0:07
 */
@Service
public class AssociationServiceImpl implements AssociationService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AssociationDao associationDao;

    public Association getAssociationById(Long associationId) {
        if (associationId == null) {
            return null;
        }
        return associationDao.getAssociationDetailById(associationId);
    }

    public Page getAssociationListByStarAndTypeAndPage(Integer type, Integer star, String name, Integer currentPage) {
        if (currentPage == null) {
            currentPage = 1;
        }
        String typeString = null;
        if (type != null && !"".equals(type)) {
            typeString = AssociationStatEnum.stateOf(type);
        }

        // 设置页码信息
        Page associationPage = new Page();
        int totalCount = associationDao.getAssociationNumber(typeString, star, name);
        associationPage.setTotalCount(totalCount);
        int totalPage = (int) Math.ceil(totalCount * 1.0 / associationPage.getPageSize());
        associationPage.setTotalPage(totalPage);
        if (currentPage < 1) {
            associationPage.setCurrentPage(1);
            currentPage = 1;
        } else if (currentPage > totalPage) {
            associationPage.setCurrentPage(totalPage);
            currentPage = totalPage;
        } else {
            associationPage.setCurrentPage(currentPage);
        }
        if (totalCount == 0) {
            return associationPage;
        }

        int pageSize = associationPage.getPageSize();
        int offset = (currentPage - 1) * pageSize;
        associationPage.setList(associationDao.getAssociationList(typeString, star, name, offset, pageSize));
        return associationPage;
    }
}
