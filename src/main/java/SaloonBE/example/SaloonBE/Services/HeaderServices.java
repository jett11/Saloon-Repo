package SaloonBE.example.SaloonBE.Services;

import SaloonBE.example.SaloonBE.Model.Header;
import java.util.List;


public interface HeaderServices {

    //GET all Header data
    List<Header> fetchHeaderList();

}
