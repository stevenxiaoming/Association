package org.shu.association.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.shu.association.entity.Association;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/25
 * Time: 22:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class AssociationDaoTest {

    @Resource
    private AssociationDao associationDao;

    @Test
    public void getAssociationNumber() throws Exception {
        int count = associationDao.getAssociationNumber(null, null, null);
        System.out.println(count);
    }

    @Test
    public void getAssociationList() throws Exception {
        Association association = new Association("公益实践", (short) 1);
        List<Association> list = associationDao.getAssociationList("公益实践", 1, null, 1, 5);
        System.out.println(list);
    }

    @Test
    public void getAssociationDetailById() throws Exception {
        Association association = associationDao.getAssociationDetailById(1003L);
        System.out.println(association);
    }

    @Test
    public void insertAssociation() throws Exception {
        Association association = new Association(9999L, "测试社团", "公益实践", (short)1,
                "测试部", "测试工程师", (short)1, "test", "default",
                "just a test", "test@test.com", "wechatid",
                "wechatname", "wechatcode", "12345678", (byte)0,
                "nothing to say", new Date(), new Date());
        System.out.println(association.getAssociationId());
        int count = associationDao.insertAssociationMain(association);
        System.out.println(association.getAssociationId());
        System.out.println(count);
        count = 0;
        count = associationDao.insertAssociationIntroduction(association);
        System.out.println(count);
    }

    @Test
    public void updateAssociationEssential() throws Exception {
        Association association = new Association(1004L, "测试社团1", "公益实践", (short)2,
                "测试部1", "测试工程师1", (short)1);
        association.setGmtModified(new Date());
        int count = associationDao.updateAssociationEssential(association);
        System.out.println(count);
    }

    @Test
    public void updateAssociationBasic() throws Exception {
        Association association = new Association(1004L, "test1", "default1",
                "just a test1", "test1@test.com", "wechatid1",
                "wechatname1", "wechatcode1", "123456780", (byte)0,
                "nothing to say1");
        association.setGmtModified(new Date());
        int count = associationDao.updateAssociationBasic(association);
        System.out.println(count);
        count = associationDao.updateAssociationIntroduction(association);
        System.out.println(count);
    }

    @Test
    public void deleteAssociation() throws Exception {
        Long id = 1003L;
        int count = associationDao.deleteAssociationMain(id);
        System.out.println(count);
        count = associationDao.deleteAssociationIntroduction(id);
        System.out.println(count);
    }

}