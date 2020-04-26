package commun_client.commandes.ChangerLocale;

import java.util.Locale;

import commun_client.commandes.CommandePourEnvoi;

public interface ChangerLocalePourEnvoi extends CommandePourEnvoi {
	
	void setLocale(Locale locale);

}