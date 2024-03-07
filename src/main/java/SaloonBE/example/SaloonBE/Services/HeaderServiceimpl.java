package SaloonBE.example.SaloonBE.Services;

import SaloonBE.example.SaloonBE.Model.Header;
import SaloonBE.example.SaloonBE.Repository.HeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Objects;

import java.util.List;

@Service
public class HeaderServiceimpl implements HeaderServices{
    @Autowired
    private HeaderRepository headerRepository;

    @Override
    public List<Header> fetchHeaderList()
    {
        return (List<Header>) headerRepository.findAll();
    }

    @Override
    public Header updateHeader(Header header , int id)
    {
        System.out.println("TEST"+ id);
        Header newHeader = headerRepository.findById(id).get();
        newHeader.setLogo(header.getLogo());
        newHeader.setSlogan(header.getSlogan());
        newHeader.setAddress(header.getAddress());
        newHeader.setContact_phone(header.getContact_phone());
        newHeader.setContact_email(header.getContact_email());
        newHeader.setSocial_media_links(header.getSocial_media_links());
        newHeader.setLast_updated_date(header.getLast_updated_date());
        Header updatedHeader = headerRepository.save(newHeader);
        return updatedHeader;

    }


    @Override
   public void deleteHeaderById(int id){
        headerRepository.deleteById(id);
   }
   @Override
    public Header saveHeader(Header header){
        return headerRepository.save(header);
   }
}
