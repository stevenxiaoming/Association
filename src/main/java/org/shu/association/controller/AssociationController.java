package org.shu.association.controller;

import org.apache.ibatis.annotations.Param;
import org.shu.association.dto.Page;
import org.shu.association.entity.Association;
import org.shu.association.service.AssociationService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA
 * User: StevenMing
 * Date: 2017/4/28
 * Time: 8:28
 */
@Controller
@RequestMapping("/")
public class AssociationController {
    private final org.slf4j.Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AssociationService associationService;

//    @RequestMapping(value = "/list",
//            method = RequestMethod.POST,
//            produces = {"application/json;charset=UTF-8"})
//    @ResponseBody
//    public Page Associationlist(@PathVariable("type") Integer type,
//                                           @PathVariable("star") Integer star,
//                                           @PathVariable("Page") Integer currentPage) {
//        Page resultAssociationPage;
//        resultAssociationPage = associationService.getAssociationListByStarAndTypeAndPage(type, star, currentPage);
//        return resultAssociationPage;
//    }

    /**
     * 社团列表展示页，默认无条件
     * @param model
     * @return
     */
//    @RequestMapping(value = "/association", method = RequestMethod.GET)
//    public String Associationlist(Model model) {
//        Page resultPage;
//        resultPage = associationService.getAssociationListByStarAndTypeAndPage(null, null, null, 1);
//        model.addAttribute("page", resultPage);
//        return "association";
//    }

    /**
     * 社团列表展示页，根据用户条件搜索
     * @param type
     * @param star
     * @param currentPage
     * @return
     */
    @RequestMapping(value = "/association",
            method = RequestMethod.POST,
            produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Page AssociationList(@CookieValue(value = "type", required = false) Integer type,
                                @CookieValue(value = "star", required = false) Integer star,
                                @Param("currentPage") Integer currentPage,
                                @CookieValue(value = "name", required = false) String name) {
        return associationService.getAssociationListByStarAndTypeAndPage(type, star, name, currentPage);
    }

    /**
     * 社团详细信息页面
     * @param associationId
     * @param model
     * @return
     */
    @RequestMapping(value = "/association/{associationId}", method = RequestMethod.GET)
    public String detail(@PathVariable("associationId") Long associationId, Model model) {
        if (associationId == null) {
            return "redirect:/association.jsp";
        }
        Association association = associationService.getAssociationById(associationId);
        if (association == null) {
            return "redirect:/association.jsp";
        }
        model.addAttribute("association", association);
        return "associationDetail";
    }
}
