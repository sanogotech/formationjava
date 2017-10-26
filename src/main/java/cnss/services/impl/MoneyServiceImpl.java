package cnss.services.impl;

import org.springframework.stereotype.Service;

import cnss.services.MoneyService;

@Service
public class MoneyServiceImpl implements MoneyService {

	@Override
	public long convertirCFAEURO(long argentcfa) {

		return (long)(argentcfa/656);
	}

}
