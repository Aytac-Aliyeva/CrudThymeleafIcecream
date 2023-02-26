//package com.example.crudthymeleaficecream.controller;
//
//
//import com.example.crudthymeleaficecream.DTO.IcecreamDto;
//import com.example.crudthymeleaficecream.entity.IcecreamEntity;
//import com.example.crudthymeleaficecream.exceptionhandler.IcecreamRequestException;
//import com.example.crudthymeleaficecream.service.IcecreamService;
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/ICECREAM")
//public class IcecreamRestController {
//
//    private final IcecreamService icecreamService;
//
//    public IcecreamRestController(IcecreamService icecreamService) {
//        this.icecreamService = icecreamService;
//    }
//
//    @GetMapping("/get-all-icecreams")
//    public List<IcecreamDto> getAllIcecreams() throws IcecreamRequestException {
//
//        throw new IcecreamRequestException("Oops can't get all students with custom exception");
////        List<IcecreamEntity> allIcecreams = icecreamService.getAllIcecreams();
////        List<IcecreamDto> icecreamDtos = icecreamService.fromEntityListToDtoList(allIcecreams);
////        return icecreamDtos;
//    }
//
//
//    @GetMapping("/get-icecream-by-id{id}")
//    public IcecreamDto getIcecreamByID(@RequestParam Long id) throws ClassNotFoundException {
//        IcecreamEntity icecreamEntity = icecreamService.getIcecreamByID(id);
//        IcecreamDto icecreamDto = IcecreamService.fromEntityToDto(icecreamEntity);
//        return icecreamDto;
//    }
//
//    @PostMapping("/add-icecream")
//    public IcecreamEntity addIcecream(@Valid @RequestBody IcecreamDto icecreamDto) {
//        IcecreamEntity icecreamEntity = IcecreamService.fromDtoToEntity(icecreamDto);
//        IcecreamEntity icecreamEntity1 = icecreamService.saveIcecream(icecreamEntity);
//        return icecreamEntity1;
//
//
//    }
//
//
//    @PostMapping("/update-icecream")
//    public IcecreamEntity updateIcecream(@RequestBody IcecreamDto icecreamDto) throws ChangeSetPersister.NotFoundException {
//        IcecreamEntity icecreamEntity = IcecreamService.fromDtoToEntity(icecreamDto);
//        IcecreamEntity icecreamEntity1 = icecreamService.updateIcecream(icecreamEntity);
//        return icecreamEntity1;
//
//
//    }
//
//
//    @DeleteMapping("/delete-icecream{id}")
//    public IcecreamEntity deleteIcecream(@RequestParam Long id) {
//        icecreamService.deleteIcecream(id);
//
//
//        return null;
//    }
//
//
//}
