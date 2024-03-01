package SaloonBE.example.SaloonBE.Services;

import SaloonBE.example.SaloonBE.Model.Header;
import SaloonBE.example.SaloonBE.Repository.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeaderServiceimpl implements HeaderServices{
    @Autowired
    private HeaderRepository headerRepository;

    @Override
    public List<Header> fetchHeaderList(){
        return (List<Header>) headerRepository.findAll();
    }
}
