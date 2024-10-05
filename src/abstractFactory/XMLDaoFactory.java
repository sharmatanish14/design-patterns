package abstractFactory;

public class XMLDaoFactory extends DaoAbstractFactory {

    Dao dao = null;

    @Override
    public Dao createDao(String type) {
        if (type.equals("emp")) {
            dao = new XMLEmpDao();
        } else if (type.equals("dept")) {
            dao = new XMLDeptDao();
        }

        return dao;

    }
}
