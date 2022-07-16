// marker 이미지 링크
var imageSrcFood = '/img/marker_food.png', // 음식점
    imageSrcGym = '/img/marker_gym.png', // 체육관
    imageSrcStore = '/img/marker_store.png', // 가게

    // marker 이미지의 크기와 옵션
    // 3개의 marker에 전부 같은 그림을 적용했기 때문에 두 값은 고정됨
    imageSize = new kakao.maps.Size(64, 69),
    imageOption = {offset: new kakao.maps.Point(32, 69)};

// marker 이미지 지정
var markerImageFood = new kakao.maps.MarkerImage(imageSrcFood, imageSize, imageOption),
    markerImageGym = new kakao.maps.MarkerImage(imageSrcGym, imageSize, imageOption),
    markerImageStore = new kakao.maps.MarkerImage(imageSrcStore, imageSize, imageOption);

// marker 위치 지정
var markerPosition = new kakao.maps.LatLng(37.30112925003259, 127.03015700702334),
    markerPosition2 = new kakao.maps.LatLng(37.30112925003259, 127.03515700702334),
    markerPosition3 = new kakao.maps.LatLng(37.30112925003259, 127.04015700702334);

// marker 생성
var markerFood = new kakao.maps.Marker({
    position: markerPosition,
    image: markerImageFood
});

var markerGym = new kakao.maps.Marker({
    position: markerPosition2,
    image: markerImageGym
});

var markerStore = new kakao.maps.Marker({
    position: markerPosition3,
    image: markerImageStore
})

markerGym.setMap(map);
markerFood.setMap(map);
markerStore.setMap(map);