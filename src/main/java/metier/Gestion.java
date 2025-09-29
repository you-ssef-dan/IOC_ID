package metier;

import dao.ICalcul;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Gestion implements IGestion{
    @Autowired
    @Qualifier("calculV2")
    ICalcul cal;
    @Override
    public double calcul() {

        return cal.getValue()*10;
    }

    public void setCal(ICalcul cal) {
        this.cal = cal;
    }
}
