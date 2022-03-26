package com.me.constructorinjection.controller;

import com.me.constructorinjection.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bad")
public class BadController {

    private final VideoRepository videoRepository;

    /**
     * 手动注入
     */
//    public BadController() {
//        // 每次都new，非常低效
//        videoRepository = new VideoRepository();
//    }

    /**
     * 字段注入
     *
     * 缺点：
     * 1、私有字段(private) Spring需要通过反射来处理
     * 2、不能是final修饰，意味着可能未初始化返回为null
     * 3、测试困难，私有属性需要通过反射来获取
     */
//    @Autowired
//    private VideoRepository videoRepository;

    /**
     * 构造注入
     *
     * 注意：构造注入加@Autowired从Spring 4.3开始就变得多余了
     * Spring已经足够聪明，当类中有一个构造函数时，@Autowired已经在这了
     *
     * 缺点：
     * 1、在依赖特别多的情况下，构造函数将变得很长
     */
//    @Autowired
//    public BadController(VideoRepository videoRepository) {
//        this.videoRepository = videoRepository;
//    }

    public BadController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    /**
     * setter注入
     *
     * 缺点：
     * 1、需要加@Autowired注解
     * 2、字段不能是final类型，final类型需要通过构造函数实例化时初始化
     *    而且final字段不允许有set方法来重新修改它
     */
//    @Autowired
//    public void setVideoRepository(VideoRepository videoRepository) {
//        this.videoRepository = videoRepository;
//    }
}
