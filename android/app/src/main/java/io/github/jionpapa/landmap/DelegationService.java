package io.github.jionpapa.landmap;

import com.google.androidbrowserhelper.locationdelegation.LocationDelegationExtraCommandHandler;

/** 웹앱이 위치를 요청하면 이 앱의 위치 권한으로 처리합니다. */
public class DelegationService extends com.google.androidbrowserhelper.trusted.DelegationService {
    @Override
    public void onCreate() {
        super.onCreate();
        registerExtraCommandHandler(new LocationDelegationExtraCommandHandler());
    }
}
