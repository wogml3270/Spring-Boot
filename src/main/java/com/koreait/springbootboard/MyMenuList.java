package com.koreait.springbootboard;

import com.koreait.springbootboard.board.model.BoardCategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyMenuList {
    @Autowired private HomeService service;

    private List<BoardCategoryEntity> menuList;

    @Bean("menus")
    public List<BoardCategoryEntity> getMenus(){
        if(menuList == null){
            menuList = service.selMenuCategoryList();
        }
        return menuList;
    }
}
