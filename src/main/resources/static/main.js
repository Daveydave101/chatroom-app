







// ...existing code...});    document.getElementById('deleteRoomNameInput').value = '';    stompClient.send("/app/deleteRoom", {}, roomName);    const roomName = document.getElementById('deleteRoomNameInput').value;    event.preventDefault();document.getElementById('deleteRoomForm').addEventListener('submit', function(event) {