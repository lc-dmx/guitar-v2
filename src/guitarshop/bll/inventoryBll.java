package guitarshop.bll;

import guitarshop.dal.inventoryDal;
import guitarshop.entity.inventory;

public class inventoryBll {
	public static inventory inventory()//��ʼ��inventory ��ȡ���м������ص�inventory��
	{
		return inventoryDal.inventory();
	}

}
