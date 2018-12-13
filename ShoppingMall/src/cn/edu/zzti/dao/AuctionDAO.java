package cn.edu.zzti.dao;

import java.sql.SQLException;
import java.util.List;

import cn.edu.zzti.entity.AuctionDO;

//��Ʒ����
public interface AuctionDAO extends BaseDAO {
	
	/*
	 * �ýӿڶ�������Ʒ������������ط���,������ȡȫ����Ʒ��Ϣ.
	 * ��ȡָ����Ʒ��Ϣ,�����Ʒ��Ϣ��ɾ��ָ����Ʒ��Ϣ.
	 */
	
	//������Դ�л�ȡָ��id��Ӧ����Ʒ��Ϣ
	public AuctionDO getAuction(String id) throws SQLException;
	
	//���һ����Ʒ��Ϣ������Դ��
	public void addAuction(AuctionDO auction) throws SQLException;
	
	//��ȡ����Դ�е�ȫ������Ʒ�б�
	public List<AuctionDO> getAll() throws SQLException;
	
	//ͨ����Ʒidɾ��һ����Ʒ��¼
	public void deleteAuction(String id) throws SQLException;
	
	//�޸�����Դ��ָ����Ʒ��Ϣ
	public void updateAuction(AuctionDO auction) throws SQLException;
	
}
