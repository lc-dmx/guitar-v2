package guitarshop.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import guitarshop.obdc;
import guitarshop.entity.guitarspec;
import guitarshop.entity.inventory;

public class inventoryDal {

	public static inventory inventory() // ��ȡ���м������ص�inventory��
	{
		inventory inventory = new inventory();
		// List<guitar> guitars = new ArrayList<guitar>();
		Connection connection = obdc.getConnection();
		PreparedStatement pstat;
		ResultSet rs;
		try {
			pstat = connection.prepareStatement("select * from guitar");
			rs = pstat.executeQuery();
			while (rs.next()) {
				guitarspec guitarspec = new guitarspec(null);
				guitarspec.setBuilder(rs.getString("builder"));
				guitarspec.setTopWood(rs.getString("topwood"));
				guitarspec.setBackWood(rs.getString("backwood"));
				guitarspec.setType(rs.getString("type"));
				guitarspec.setModel(rs.getString("model"));

				inventory.addguitar(rs.getString("serialNumber"), rs.getDouble("price"), guitarspec);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inventory;
	}
}
