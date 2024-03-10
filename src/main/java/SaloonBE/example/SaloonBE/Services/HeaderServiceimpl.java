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
        newHeader.setHeaderBannerImage(header.getHeaderBannerImage());
        newHeader.setMenu(header.getMenu());
        newHeader.setMain_text(header.getMain_text());
        newHeader.setWelcome_text(header.getWelcome_text());
        newHeader.setDescription_below(header.getDescription_below());
        newHeader.setButton_name(header.getButton_name());
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
