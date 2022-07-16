const container = document.getElementById('map');
const options = {
// 경기대학교 중심 좌표 (위도, 경도)
center: new kakao.maps.LatLng(37.30112925003259, 127.03515700702334),

// 확대 레벨
level: 4
};

// 지도
const map = new kakao.maps.Map(container, options);