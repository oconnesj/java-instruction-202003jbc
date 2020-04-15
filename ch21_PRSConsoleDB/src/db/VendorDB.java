package db;

import java.sql.*;
import java.util.*;

import business.Vendor;


public class VendorDB implements DAO<Vendor> {
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prs_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"
				+ "";
		String username = "prs_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		return conn;
	}

	public Vendor login(String un, String pw) {
		Vendor v = null;
		String sql = "SELECT * from Vendor where username = ? and password= ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setString(1, un);
			ps.setString(2, pw);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				v = getVendorFromResultSet(rs);
			} else {
				// no user found for un,pw
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;
	}

	@Override
	public Vendor get(int id) {
		Vendor v = null;
		String sql = "SELECT * from Vendor where id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				v = getVendorFromResultSet(rs);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return v;
	}

	@Override
	public List<Vendor> list() {
		String sql = "SELECT * from Vendor";
		List<Vendor> vendors = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			// while there is a row in the rs
			while (rs.next()) {
				Vendor v = getVendorFromResultSet(rs);
				vendors.add(v);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vendors;
	}

	private Vendor getVendorFromResultSet(ResultSet rs) throws SQLException {
		// int id = rs.getInt("id");
		int id = rs.getInt(1);
		String code = rs.getString(2);
		String name = rs.getString(3);
		String address = rs.getString(4);
		String city = rs.getString(5);
		String state = rs.getString(6);
		String zip = rs.getString(7);
		String phoneNumber = rs.getString(8);
		String email = rs.getString(9);

		Vendor v = new Vendor(id, code, name, address, city, state, zip, phoneNumber, email);
		return v;
	}

	@Override
	public boolean add(Vendor v) {
		boolean success = false;
		String sql = "INSERT into Vendor (Name, Code, Name, Address "
				+ "City, State, Zip, PhoneNumber, Email)" + " values (?,?,?,?,?,?,?,?,?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, v.getVendorName());
			ps.setString(2, v.getVendorCode());
			ps.setString(3, v.getVendorName());
			ps.setString(4, v.getVendorAddress());
			ps.setString(5, v.getVendorCity());
			ps.setString(6, v.getVendorState());
			ps.setString(7, v.getVendorZip());
			ps.setString(8, v.getVendorPhoneNumber());
			ps.setString(9, v.getVendorEmail());
			ps.executeUpdate();
			success = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return success;
	}

	
	@Override
	public boolean update(Vendor v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Vendor v) {
		boolean success = false;
		String sql = "DELETE from Vendor where id = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, v.getId());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return success;
	}

}
