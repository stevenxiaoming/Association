package org.shu.association.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.shu.association.service.AssociationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/28
 * Time: 0:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-service.xml"
})
public class AssociationServiceImplTest {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AssociationService associationService;

    @Test
    public void getAssociationById() throws Exception {
        System.out.println(associationService.getAssociationById(1005L));
    }

    @Test
    public void getAssociationListByStarAndType() throws Exception {
        System.out.println(associationService.getAssociationListByStarAndTypeAndPage(null, null, "上海", null));
    }

}